package college.faculdade;

public class Professor extends Pessoa{
    
    public float Salario;
    public String Materia;
    
    public Professor(String Nome, String Matricula, String Endereco, String Materia, float Salario) {
        super(Nome, Matricula, Endereco);
        this.Salario = Salario;
        this.Materia = Materia;
    }
    
}
