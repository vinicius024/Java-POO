package college.faculdade;


public class Sistema {
    
    public static void main(String [] args) {
        
        Professor Prof01 = new Professor("Vinicius", "123456", "Rua tchan tchan", "Engenharia AeroEspacial", 10000f);
        
        System.out.println("=====Professor=====");
        System.out.println("Nome: " + Prof01.Nome);
        System.out.println("Matricula: " + Prof01.Matricula);
        System.out.println("Endereço: " + Prof01.Endereco);
        System.out.println("Disciplina: " + Prof01.Materia);
        System.out.println("Salario: " + Prof01.Salario);
        System.out.println("=========================");
        Aluno Alu = new Aluno("Bianca" , "654321", "Rua qualquer", 7.6f);
        System.out.println("=====Aluno=====");
        System.out.println("Nome: " + Alu.Nome);
        System.out.println("Matricula: " + Alu.Matricula);
        System.out.println("Endereço: " + Alu.Endereco);
        System.out.println("Nota: " + Alu.Nota);
        System.out.println("=========================");

        
    }
}
