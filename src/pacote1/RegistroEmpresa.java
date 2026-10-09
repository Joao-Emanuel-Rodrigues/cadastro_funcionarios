package pacote1;

public class RegistroEmpresa {
    
    private String nomeSobrenomeFuncionario;
    private double salarioFuncionario;
    private int codigoFuncionario;

    public RegistroEmpresa(String nomeSobrenomeFuncionario, double salarioFuncionario,
            int codigoFuncionario) {
        this.nomeSobrenomeFuncionario = nomeSobrenomeFuncionario;
        this.salarioFuncionario = salarioFuncionario;
        this.codigoFuncionario = codigoFuncionario;
    }

    

    @Override
    public String toString() {
        return "\nnome e sobrneome do Funcionario:  " + nomeSobrenomeFuncionario + " \nsalarioFuncionario:  " + salarioFuncionario + " \ncodigoFuncionario:  " + codigoFuncionario;
    }



    public String getNomeFuncionario() {
        return nomeSobrenomeFuncionario;
    }
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeSobrenomeFuncionario = nomeFuncionario;
    }
    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }
    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }
    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }
    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
}
