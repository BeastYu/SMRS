package controlsystem.service.impl;

import controlsystem.dao.LogDao;
import controlsystem.entity.T_Log;
import controlsystem.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    LogDao logMapper ;

    @Override
    public void addLog(T_Log t_log) {
        logMapper.insert(t_log);
    }
}
