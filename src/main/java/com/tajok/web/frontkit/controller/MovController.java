package com.tajok.web.frontkit.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.tajok.web.frontkit.model.Mov;
import com.tajok.web.frontkit.model.User;
import com.tajok.web.frontkit.service.IMovService;
import com.tajok.web.util.utils.Encrypter;

@Controller
@RequestMapping("/mov")
public class MovController {
	
	@Resource
	private IMovService movService;//将本地的userService属性注入，等同且替代了setter
	
	/**
	 * 观看视频
	 * 转发
	 * @param content
	 * @return
	 */
	@RequestMapping("/show/{id}") //带占位符的URL
	public String show(HttpServletRequest request,@PathVariable int id){
		
		Mov mov = movService.show(id);
		request.setAttribute("movUrl", mov.getMovUrl());
		request.setAttribute("resUrl", mov.getResUrl());
		request.setAttribute("descp", mov.getDescp());
		
		return "/WEB-INF/jsp/front/movAction/mov.jsp";
	}
	
	/**
	 * 搜索视频
	 * 转发
	 * @param content
	 * @return
	 */
	@RequestMapping("/search")
	public String search(HttpServletRequest request,@RequestParam String content){
		
		List<Mov> movList = movService.search(content);
		request.setAttribute("movList",movList);
		
		return "/WEB-INF/jsp/front/movAction/search2.jsp";
		
	}
	
	@RequestMapping("/uploadUI")
	public String addUI(HttpServletRequest request){
		return "/WEB-INF/jsp/front/movAction/addUI.jsp";
	}
	
	/**
	 * 上传视频,资源，图片
	 * 重定向
	 * @return
	 */
	@RequestMapping(value = "/upload",method = RequestMethod.POST)  
    public String upload(HttpServletRequest request,HttpSession session,@RequestParam String name,@RequestParam String descp,@RequestParam int levelId) throws IllegalStateException, IOException {  
        //创建一个通用的多部分解析器  
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());  
        //判断 request 是否有文件上传,即多部分请求  
        if(multipartResolver.isMultipart(request)){  
            //转换成多部分request    
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;  
            //取得request中的所有文件名  
            Iterator<String> iter = multiRequest.getFileNames();
            String[] paths = new String[3];
            int i = 0;
            while(iter.hasNext()){  
                //取得上传文件  
                MultipartFile file = multiRequest.getFile(iter.next());  
                if(file != null){  
                    //取得当前上传文件的文件名称  
                    String myFileName = file.getOriginalFilename();  
                    //如果名称不为“”,说明该文件存在，否则说明该文件不存在  
                    if(myFileName.trim() !=""){  
                        System.out.println(myFileName);  
                        //重命名上传后的文件名  
                        String fileName = Encrypter.randFileName() + file.getOriginalFilename();  
                        //定义上传路径  
                        String path = request.getServletContext().getRealPath("/upload") + "\\" + fileName;  
                        File headPath = new File(request.getServletContext().getRealPath("/upload"));//获取文件夹路径
                        if(!headPath.exists()){//判断文件夹是否创建，没有创建则创建新文件夹
                        	headPath.mkdirs();
                        }
                        File localFile = new File(path);  
                        file.transferTo(localFile);
                        paths[i] = "upload"+ "/" + fileName;
                        i++;
                    }  
                }  
            }  
            session = request.getSession();
    		User user = (User) session.getAttribute("user");
            movService.upload(name,descp,paths,user,levelId);
        }  
        return "redirect:/user/info.do"; //修改数据的时候要重定向
    }  
	
	
	/**
	 * 删除视频
	 * 重定向
	 * @return
	 */
	@RequestMapping("/delete")
	public String deleteMov(HttpServletRequest request,@RequestParam int id){
		movService.deleteMov(id);
		return "redirect:/user/info.do";
		
	}
	
	/**
	 * 修改视频界面
	 * 转发
	 */
	public String auditMovUI(){
		return null;
		
	}
	
	/**
	 * 修改视频信息
	 * 重定向
	 */
	public String auditMov(){
		return null;
		
	}
	
}
