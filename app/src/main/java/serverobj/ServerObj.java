package serverobj;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by gilkr on 9/29/2017.
 */

@ParseClassName("ServerObj")
public class ServerObj extends ParseObject {

    public void InsertNewUser(String userName, String password){
        put("username",userName);
        put("password",password);
    }
}
