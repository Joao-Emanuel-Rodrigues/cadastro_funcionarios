package exemplo;

import java.util.ArrayList;
import java.util.Scanner;

import pacote1.RegistroEmpresa;

public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<RegistroEmpresa> registroEmpresa = new ArrayList<>();
        int escolhaOpcao = 0;

        while (escolhaOpcao != 4){

            System.out.println("\n--- Menu do Registro dos Funcionarios da Empresa ---");
            System.out.println("\n1 - Adiconar um funcionario a empresa");
            System.out.println("\n2 - Listar os funcionario registrados");
            System.out.println("\n3 - Remover um(ou mais) funcionario(s) da empresa");
            System.out.println("\n4 - Sair do Sistema");

            escolhaOpcao = scanner.nextInt();
            scanner.nextLine();

            switch (escolhaOpcao) {
                case 1:
                    System.out.println("\nNome do funcionario: ");
                    String nomeSobrenomeFuncionario = scanner.nextLine();

                    System.out.println("\nSalario do funcionario: ");
                    double salarioFuncionario = scanner.nextInt();

                    System.out.println("\nCodigo do funcionario. Obs: 4 digitos: ");
                    int codigoFuncionario = scanner.nextInt();

                    scanner.nextLine();

                    RegistroEmpresa novoFuncionario = new RegistroEmpresa(nomeSobrenomeFuncionario, salarioFuncionario, codigoFuncionario);
                    registroEmpresa.add(novoFuncionario);
                    break;


                case 2:
                    if (registroEmpresa.isEmpty()) {
                        System.out.println("\nNão possui funcionarios. ");
                    
                    }else {

                        System.out.println("\n-- funcionario cadastradors --");

                         
                            for (RegistroEmpresa func : registroEmpresa) {
                                System.out.println(func);
                            }
                            
                        
                    }
                    break;

                case 3:
                    if (registroEmpresa.isEmpty()) {
                        System.out.println("Não há funcionarios para deletar. ");
                    } else {

                        System.out.println("Digite o codigo referente ao funcionario que deseja deletar: ");
                        int codigoProcurado = scanner.nextInt();
                        scanner.nextLine();

                        boolean removido = registroEmpresa.removeIf(func -> func.getCodigoFuncionario() == codigoProcurado);

                        }
                    
                    break;
                
                case 4:
                    System.out.println("\nSaindo do sistema. Ate a proxima. ");

                default:
                    break;
            }

        }

        scanner.close();
    }

    }
