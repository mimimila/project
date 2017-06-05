/**
 * Created by ACER on 01.06.2017.
 */
public class privateAccsess {
    private String login;
    private String password;
    //Геттеры, сеттеры
   private void setLogin(String login){
        this.login=login;
    }
    private void setPassword(String password){
        this.password=password;
    }

    String getLogin(){
        return this.login;
    }
    String getPassword(){
        return  this.password;
    }
    private void  setData(String l, String p){
        setLogin(l);
        setPassword(p);
     }
}
