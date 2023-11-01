package CopyFile.controller;

import CopyFile.repo.CopyFileRepository;
import CopyFile.view.Menu;

public class CopyFileController extends Menu<String>{
    
    static String[] mc = {"Copy File", "Exit"};
    public CopyFileController(){
        super("Copy Program", mc);
    }
    CopyFileRepository c = new CopyFileRepository();
    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                c.readFileConfig();
                break;
            case 2:
                System.exit(0);
            default:
        }
    }
    
}


