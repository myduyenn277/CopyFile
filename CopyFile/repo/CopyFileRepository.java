package CopyFile.repo;

import CopyFile.dataAccess.CopyFileDao;

public class CopyFileRepository {

    public void readFileConfig() {
        CopyFileDao.Instance().readFileConfig();
    }
}

