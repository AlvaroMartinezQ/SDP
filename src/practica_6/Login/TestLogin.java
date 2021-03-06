package practica_6.Login;

public class TestLogin {
    
    private LoginSingleton log1, log2;
    
    public TestLogin(){
        log1 = LoginSingleton.getInstance();
        log2 = LoginSingleton.getInstance();
    }
    
    public void ejecutarTest(){
        
        
        System.out.println("---Pruebas TestLogin:\n\n");
        
        System.out.println("-Registramos al usuario Pepe de contraseña 1234 en los dos logins:\n");
        log1.registrar("Pepe", "1234");
        log2.registrar("Pepe", "1234");
        System.out.println("\nComo podemos observar los dos log comparten los datos.\n\n");
        
        System.out.println("-Registramos al usuario Antonio de contraseña 1234 en un login:\n");
        log1.registrar("Antonio", "1234");
        
        System.out.println("\n\n-Accedemos a Pepe en log1 y Antonio en log2:\n\n");
        log1.acceder("Pepe", "1234");
        log2.acceder("Antonio", "1234");
        System.out.println("Seguimos viendo la comparticion de datos.\n\n");
        
        System.out.println("---Fin Pruebas TestLogin.\n\n");
    }
}
