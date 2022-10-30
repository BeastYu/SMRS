package controlsystem.dao;

import controlsystem.entity.T_picture;

import java.util.List;
import java.util.Map;

public interface PictureDao {
    //修改图片
    int update(Map<String,Object> paramap);
//根据图片名字查看图片
    List<T_picture> selectPicByCondition(String str);
//    插入图片
    void add(T_picture t_picture);
//    删除图片
    void delete(String str);

    List<T_picture> AllPicture() ;
}
