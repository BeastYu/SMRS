package controlsystem.service;

import controlsystem.entity.T_picture;

import java.util.List;

public interface PicService {
//    查看图片
    List<T_picture> getPic(String acount);
//    更新图片
    int updatePic(String pcode,String pname,String pauthor,String pPhone,String paddress,String pfax,String pdesc);
//    插入图片
    void addPic(T_picture t_picture);
//    删除图片
    void delete(T_picture t_picture);
//    根据信息查找图片
    List<T_picture> AllPicture();

}
