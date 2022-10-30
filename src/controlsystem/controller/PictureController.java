package controlsystem.controller;

import controlsystem.dao.PictureDao;
import controlsystem.entity.T_picture;
import controlsystem.service.PicService;
import controlsystem.service.impl.PicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PictureController {

    @Autowired
    PicService picServiceImpl;
    @Autowired
    PictureDao pictureDao;


    @RequestMapping("/selectAll")
    public ModelAndView selectAll(){
        List<T_picture> picture = picServiceImpl.AllPicture();
        ModelAndView mav=new ModelAndView();
//        返回的页面值
        mav.setViewName("picture.jsp");
//        返回页面时携带的数据
        mav.addObject("picInfo",picture);
        return mav;
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam(name = "pcode",required = true) String code,
                            @RequestParam(name = "pname",required = true) String name,
                            @RequestParam(name = "pauthor",required = true) String author,
                            @RequestParam(name = "pPhone",required = true) String phone,
                            @RequestParam(name = "paddress") String address,
                            @RequestParam(name = "pfax") String fax,
                            @RequestParam(name = "pdesc") String desc,
                            HttpServletRequest req) throws UnsupportedEncodingException {
        req.setCharacterEncoding("UTF-8");
        ModelAndView mav = new ModelAndView();
        T_picture t_picture=new T_picture();
        t_picture.setPname(name);
        t_picture.setPcode(code);
        t_picture.setPauthor(author);
        t_picture.setpPhone(phone);
        t_picture.setPaddress(address);
        t_picture.setPfax(fax);
        t_picture.setPdesc(desc);
        t_picture.setPtime(new Timestamp(System.currentTimeMillis()));
        pictureDao.add(t_picture);

        mav.setViewName("/selectAll");
        return mav;

    }

    @GetMapping("/delete/{pcode}")
    public ModelAndView deleteTest(@PathVariable String pcode, Map<String, Object> map){
        //调用用service层的删除方法，也可以调用通用mapper自带的方法
        pictureDao.delete(pcode);
        //调用分页的方法，带着更新过的数据返回到页面
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/selectAll");
        return mav;
    }

    @RequestMapping("/select")
    public ModelAndView select(@RequestParam(name = "pname",required = true) String name,HttpServletRequest req){
        List<T_picture> pictures = (List<T_picture>) picServiceImpl.getPic(name);
        ModelAndView mav=new ModelAndView();
        req.getSession().setAttribute("picInfo",pictures);
        mav.setViewName("picture.jsp");
        return mav;
    }

//    @ResponseBody
//    @RequestMapping("/uploadfile")
//    public Map<String,Object> uploadFile(MultipartFile myfile) {
//
////        定义map集合
//        Map<String, Object> map = new HashMap<String, Object>();
////       获取文件写文件到本地磁盘
//        FileOutputStream outputStream = null;
//        InputStream inputStream = null;
//        try {
//            inputStream = myfile.getInputStream();
//            outputStream = new FileOutputStream(new File("C:\\Users\\lenovo\\Desktop\\tupian\\"+myfile.getOriginalFilename()));
//            //边读边写
//            byte[] b = new byte[1024];
//            int len = 0;
//            while ((len = inputStream.read(b)) != -1) {
//                outputStream.write(b, 0, len);
//            }
//            outputStream.flush();
//            outputStream.close();
//            inputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        map.put("code", "success");
//        return map;
//    }
}
