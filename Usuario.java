public class Usuario  {
    protected static final String CARGO;

    static {
        CARGO = Usuario.class.getSimpleName();
    }

    public Usuario() {

    }

    public String getCargo() {
        return CARGO;
    }
}