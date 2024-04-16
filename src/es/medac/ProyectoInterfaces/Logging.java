package es.medac.ProyectoInterfaces;

public class Logging {
    
    String usuario;
    String password;
    
    public Logging() {
        this.usuario = "";
        this.password = "";
    }

    public Logging(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public String logging_usuario(String usuario, String password) {
        String mensaje;
        if (usuario.equals("Admin") && password.equals("1111")) {
            mensaje = "Log Admin correcto";
        } else if ((usuario.equals("Juan") && password.equals("1234"))) {
            mensaje = "Log Juan correcto";
        } else if ((usuario.equals("Diego") && password.equals("7777"))) {
            mensaje = "Log Diego correcto";
        } else if ((usuario.equals("Kevin") && password.equals("9895"))) {
            mensaje = "Log Kevin correcto";
        } else {
            mensaje = "Log Incorrecto";
        }
        return mensaje;
    }
}

