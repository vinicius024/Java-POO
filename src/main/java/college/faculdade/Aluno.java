package college.faculdade;

public class Aluno extends Pessoa {
    
    public float Nota;
    
    public Aluno(String Nome, String Matricula, String Endereco, float Nota){
       
        super(Nome, Matricula, Endereco);
        
        this.Nota = Nota;
    }
}
