package controlsystem.service.impl;

import controlsystem.dao.PictureDao;
import controlsystem.entity.T_picture;
import controlsystem.service.PicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PicServiceImpl implements PicService {

    @Autowired
    PictureDao picServiceImpl;

    @Override
    public List<T_picture> getPic(String acount) {

        return picServiceImpl.selectPicByCondition(acount);
    }

    @Override
    public int updatePic(String pcode, String pname, String pauthor, String pPhone, String paddress, String pfax, String pdesc) {

        HashMap<String, Object> paramap = new HashMap<>();
        paramap.put("pcode", pcode);
        paramap.put("pname", pname);
        paramap.put("pauthor", pauthor);
        paramap.put("pPhone", pPhone);
        paramap.put("paddress", paddress);
        paramap.put("pfax", pfax);
        paramap.put("pdesc", pdesc);
        return picServiceImpl.update(paramap);


    }

    @Override
    public void addPic(T_picture t_picture) {


    }

    @Override
    public void delete(T_picture t_picture) {

    }

    @Override
    public List<T_picture> AllPicture() {
        return picServiceImpl.AllPicture();

    }

}
