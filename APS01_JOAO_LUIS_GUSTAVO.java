import java.util.Scanner;

public class APS01_JOAO_LUIS_GUSTAVO {
    
    //PARTE LUIS
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o seu nome completo: ");
        String nome = scan.nextLine();

        nome = nome.trim().replaceAll("\\s+", " ");

        int palavras = nome.split("\\s+").length;
        if (palavras < 2) {
            System.out.println("O nome completo deve possuir no mínimo duas palavras!");
            System.exit(0);
        }

        if (!nome.matches("[a-zA-Z\\s]+")) {
            System.out.println("O nome não pode conter caracteres especiais ou números!");
            System.exit(0);
        }

        if (nome.matches(".*\\b[a-zA-Z]{1,2}\\b.*")) {
            System.out.println("O nome completo deve possuir no mínimo três caracteres por palavra!");
            System.exit(0);
        }

        if (nome.length() <= 2) {
            System.out.println("Nome inválido! Digite um nome mais longo.");
            System.exit(0);
        }
        
        String email;
        System.out.println("Informe o seu email: ");
        email = scan.nextLine();
        
        if (!email.contains("@")) {
            System.out.println("Email inválido! O email deve conter @.");
            System.exit(0);
        }
        if (!email.endsWith(".com")) {
            System.out.println("Email inválido! Estrutura incorreta.");
            System.exit(0);
        } 
        
        String senha;
        System.out.println("Sua senha será formada pelos 3 primeiros caracteres do seu email e os 2 últimos dígitos da sua senha.");
        System.out.println("Informe os últimos dois dígitos da sua senha: ");
        senha = scan.nextLine();
        
        String senha_completa = email.substring(0, 3) + senha;
        
        if (senha.length() != 2) {
            System.out.println("Senha inválida! Deve conter exatamente dois dígitos.");
            System.exit(0);
        }
        
        if (!senha.matches("\\d{2}")) {
            System.out.println("Senha inválida! Deve conter exatamente dois dígitos numéricos.");
            System.exit(0);
        }
        
        if (!senha_completa.startsWith(email.substring(0, 3))) {
            System.out.println("Senha inválida! Não começa com os caracteres do email.");
            System.exit(0);
        }
        if (senha_completa.length() != 5 ) {
            System.out.println("Senha inválida!");
            System.exit(0);
        }
        
    System.out.println("Usuário cadastrado com sucesso!");
    System.out.println("Nome: " + nome);


        System.out.println("""
        =============================OPÇÕES=============================
                        1-Alterar Nome.
                        2-Alterar E-mail.
                        3-Imprimir Dados do Participante.
                        4-Cadastro de Convidados.
                        5-Criar Postagem
                        6-Sair do Programa
                        
        Escolha uma opção:           """);
        String opcao = scan.nextLine();
        
        // MUDAR NOME
        if (opcao.equals("1")){
            System.out.println("Informe o novo nome completo: ");
            nome = scan.nextLine();
    
            nome = nome.trim().replaceAll("\\s+", " ");
    
            palavras = nome.split("\\s+").length;
            
            if (palavras < 2) {
                System.out.println("O nome completo deve possuir no mínimo duas palavras!");
                System.exit(0);
            }
    
            if (!nome.matches("[a-zA-Z\\s]+")) {
                System.out.println("O nome não pode conter caracteres especiais ou números!");
                System.exit(0);
            }

            if (nome.matches(".*\\b[a-zA-Z]{1,2}\\b.*")) {
                System.out.println("O nome completo deve possuir no mínimo três caracteres por palavra!");
                System.exit(0);
            }
    
            if (nome.length() <= 2) {
                System.out.println("Nome inválido! Digite um nome mais longo.");
                System.exit(0);
            }

        // MUDAR EMAIL
        } else if (opcao.equals("2")) {
                System.out.println("Informe o novo email: ");
                email = scan.nextLine();
               
                if (!email.contains("@")) {
                System.out.println("Email inválido! O email deve conter @.");
                System.exit(0);
                }
                if (!email.endsWith(".com")) {
                System.out.println("Email inválido! Estrutura incorreta.");
                System.exit(0);
                }
        
        // DADOS PARTICIPANTE
        } else if (opcao.equals("3")) {
                System.out.println("\nDados do Participante:");
                System.out.println("Nome: " + nome);
                System.out.println("Email: " + email);
                System.out.println("Senha: " + senha_completa);
                    System.exit(0);
        
        }else if (opcao.equals("4")) {

            //PARTE GUSTAVO

            Scanner sc1 = new Scanner(System.in);

            Scanner sc2 = new Scanner(System.in);
            
            String convidado1 = "", convidado2 = "", convidado3 = "";

        int idadeConvidado1=0, idadeConvidado2=0, idadeConvidado3=0;

        String resposta;

        //CONVIDADO 1
        System.out.println("\nInforme o nome do convidado 1");

        convidado1 = sc1.nextLine();

        

        //sem numeros

        boolean nomeValido = true;

        if (convidado1.contains("0")||convidado1.contains("1")

                ||convidado1.contains("2")

                ||convidado1.contains("3")

                ||convidado1.contains("4")

                ||convidado1.contains("5")

                ||convidado1.contains("6")

                ||convidado1.contains("7")

                ||convidado1.contains("8")

                ||convidado1.contains("9")){

            nomeValido = false;
            System.out.println("Nome inválido");
            System.exit(0);
        }

        //minimo de 3 caracteres por palavra

        if (convidado1.matches(".*\\b\\w{1,2}\\b.*")) {
            System.out.println("O nome completo deve possuir no mínimo três caracteres por palavra!");
            System.exit(0);
        }
        if (convidado1.length() <= 2)  {
            System.out.println("Nome inválido! Digite um nome mais longo.");
            System.exit(0);
        }
        

        //sem caracteres especicais

        if (convidado1.matches("[a-zA-Z]+")) {
            nomeValido = false;
            System.out.println("Nome inválido");
            System.exit(0);
        }

        
        if (nomeValido){

            System.out.println("\nInforme a idade do convidado 1");

            idadeConvidado1 = sc2.nextInt();

            if (idadeConvidado1 < 12){
                System.out.println("Idade do convidado precisa ser acima de 12 anos!");
                System.exit(0);
            }
        }

        System.out.println("\nDeseja convidar mais alguém? SIM/NAO");

        resposta = sc1.nextLine();

        if(resposta.trim().toUpperCase().equals("SIM")){

            System.out.println("\nInforme o nome do convidado 2");
            convidado2 = sc1.nextLine();

            // sem numeros
            nomeValido = true;

            if (convidado2.contains("0") || convidado2.contains("1")
                    || convidado2.contains("2")
                    || convidado2.contains("3")
                    || convidado2.contains("4")
                    || convidado2.contains("5")
                    || convidado2.contains("6")
                    || convidado2.contains("7")
                    || convidado2.contains("8")
                    || convidado2.contains("9")) {

                nomeValido = false;
                System.out.println("Nome inválido");
                System.exit(0);
            }

            // minimo de 3 caracteres por palavra
            // minimo de 3 caracteres por palavra
            //CONVIDADO 2
            if (convidado2.matches(".*\\b\\w{1,2}\\b.*")) {
                System.out.println("O nome completo deve possuir no mínimo três caracteres por palavra!");
                System.exit(0);
            }
            if (convidado2.length() <= 2) {
                System.out.println("Nome inválido! Digite um nome mais longo.");
                System.exit(0);
            }

            // sem caracteres especiais
            if (convidado2.matches("[a-zA-Z]+")) {
                nomeValido = false;
                System.out.println("Nome inválido");
                System.exit(0);
            }

            if (nomeValido) {
                System.out.println("\nInforme a idade do convidado 2");
                idadeConvidado2 = sc2.nextInt();
            }


            if (idadeConvidado2 < 12){
                System.out.println("Idade do convidado precisa ser acima de 12 anos!");
                System.exit(0);
            }

            System.out.println("\nDeseja convidar mais alguém? SIM/NAO");

            resposta = sc1.nextLine();

            if (resposta.trim().toUpperCase().equals("SIM")){

                System.out.println("\nInforme o nome do convidado 3");

                convidado3 = sc1.nextLine();
            
                // sem numeros
                nomeValido = true;

                if (convidado3.contains("0") || convidado3.contains("1")
                    || convidado3.contains("2")
                    || convidado3.contains("3")
                    || convidado3.contains("4")
                    || convidado3.contains("5")
                    || convidado3.contains("6")
                    || convidado3.contains("7")
                    || convidado3.contains("8")
                    || convidado3.contains("9")) {

                    nomeValido = false;
                    System.out.println("Nome inválido");
                    System.exit(0);
                }

                // minimo de 3 caracteres por palavra
                if (convidado3.matches(".*\\b\\w{1,2}\\b.*")) {
                    nomeValido = false;
                    System.out.println("Nome inválido");
                    System.exit(0);
                }

                // sem caracteres especiais
                if (convidado3.matches("[a-zA-Z]+")) {
                    nomeValido = false;
                    System.out.println("Nome inválido");
                    System.exit(0);
                }

                System.out.println("\nInforme a idade do convidado 3");

                idadeConvidado3 = sc2.nextInt();

                if (idadeConvidado3 < 12){
                    System.out.println("Idade do convidado precisa ser acima de 12 anos!");
                    System.exit(0);
                }
                

                System.out.println("\nDesja convidar mais alguém? SIM/NAO");

                resposta = sc1.nextLine();

                if (resposta.trim().toUpperCase().equals("SIM")){

                    System.out.println("Limite de convites excedido.");

                        }
                }            
        }
        
        // PARTE JUCA
        // POSTAGEM
         }else if (opcao.equals("5")) {
            Scanner sc = new Scanner(System.in);
            int Titulo_limite = 15;
            int Postagem_limite = 150;
            int Limite_postagem = 3;
            int post = 0;

            // TÍTULO VÁLIDO 01
            System.out.println("Informe o Titulo de sua postagem");
            String titulo_postagem = sc.nextLine();
            
            if (titulo_postagem.length() > Titulo_limite) {
                System.out.println("Titulo excedeu limite de caracteres, por favor digitar novamente!");
                System.exit(0);
            }

            // POSTAGEM 01
            System.out.println("Titulo: \n" + titulo_postagem + "\n");
            System.out.println("Escreva sua postagem:");
            String Postagem = sc.nextLine();

            if (Postagem.length() > Postagem_limite || !Postagem.matches("[a-zA-Z]+")) {
                System.out.println("Sua postagem excedeu o limite de caracteres e ou, possui caracteres especiais\nTente novamente!");
                System.exit(0);
            } else {
                
                // CONFIRMAR POSTAGEM 01
                System.out.println("\nDeseja confirmar a postagem? Digite Sim ou nao");
                String confirmar = sc.nextLine();

                if (confirmar.toLowerCase().equals("sim")) {
                    System.out.println("Sua postagem foi postada com sucesso!\nTitulo:\n" + titulo_postagem + "\nPostagem:\n" + Postagem + "\n");
                    post++;
                } else {
                    System.out.println("Sua postagem foi cancelada");
                    System.exit(0);
                }

                // DESEJA SEGUIR PARA O PRÓXIMO POST?
                System.out.println("Deseja escrever mais um post? Digite Sim ou nao");
                String proxpost_um = sc.nextLine();

                if (proxpost_um.toLowerCase().equals("sim")) {
                    System.out.println("Por favor informe o titulo do seu novo post:");
                } else {
                    System.out.println("Ate a proxima!");
                    System.exit(0);
                }
            }

            // TÍTULO VÁLIDO 02
            System.out.println("Informe o Titulo de sua proxima postagem");
            String titulo_postagem_dois = sc.nextLine();

            if (titulo_postagem_dois.length() > Titulo_limite) {
                System.out.println("Titulo excedeu limite de caracteres, por favor digitar novamente!");
                System.exit(0);
            }

            // POSTAGEM 02
            System.out.println("Titulo:\n" + titulo_postagem_dois + "\n");
            System.out.println("Escreva sua postagem:");
            String Postagem_dois = sc.nextLine();

            if (Postagem_dois.length() > Postagem_limite || !Postagem_dois.matches("[a-zA-Z]+")) {
                System.out.println("Sua postagem excedeu o limite de caracteres e ou, possui caracteres especiais\nTente novamente!");
                System.exit(0);
            } else {
                
                // CONFIRMAR POSTAGEM 02
                System.out.println("\nDeseja confirmar a postagem? Digite Sim ou nao");
                String confirmar_dois = sc.nextLine();

                if (confirmar_dois.toLowerCase().equals("sim")) {
                    System.out.println("Sua postagem foi postada com sucesso!\nTitulo:\n" + titulo_postagem_dois + "\nPostagem:\n" + Postagem_dois + "\n");
                    post++;
                } else {
                    System.out.println("Sua postagem foi cancelada");
                    System.exit(0);
                }
            }

            // DESEJA SEGUIR PARA O PRÓXIMO POST?
            System.out.println("Deseja escrever mais um post? Digite Sim ou nao");
            String proxpost_dois = sc.nextLine();

            if (proxpost_dois.toLowerCase().equals("sim")) {
                System.out.println("Por favor informe o titulo do seu novo post:");
            }else {
                    System.out.println("Ate a proxima!");
                    System.exit(0);
                }

            // TÍTULO VÁLIDO 03
            System.out.println("Informe o Titulo de sua proxima postagem");
            String titulo_postagem_tres = sc.nextLine();

            if (titulo_postagem_tres.length() > Titulo_limite) {
                System.out.println("Titulo excedeu limite de caracteres, por favor digitar novamente!");
                System.exit(0);
            }

            // POSTAGEM 03
            System.out.println("Titulo:\n" + titulo_postagem_tres + "\n");
            System.out.println("Escreva sua postagem:");
            String Postagem_tres = sc.nextLine();

            if (Postagem_tres.length() > Postagem_limite || !Postagem_tres.matches("[a-zA-Z]+")) {
                System.out.println("Sua postagem excedeu o limite de caracteres e ou, possui caracteres especiais\nTente novamente!");
                System.exit(0);
            } else {
                
                // CONFIRMAR POSTAGEM 03
                System.out.println("\nDeseja confirmar a postagem? Digite Sim ou nao");
                String confirmar_tres = sc.nextLine();

                if (confirmar_tres.toLowerCase().equals("sim")) {
                    System.out.println("Sua postagem foi postada com sucesso!\nTitulo:\n" + titulo_postagem_tres + "\nPostagem:\n" + Postagem_tres + "\n");
                    post++;
                } else {
                    System.out.println("Sua postagem foi cancelada");
                    System.exit(0);
                }
            }
                //LIMITE DE POSTAGEM ATINGIDA
            if (post == Limite_postagem) {
                System.out.println("\nVoce atingiu o limite de posts permitidos :D");
                System.out.println("Segue todos os posts feitos por voce!\n" +
                        "\nTitulo:\n" + titulo_postagem + "\nPostagem:\n" + Postagem + "\n" +
                        "\nTitulo:\n" + titulo_postagem_dois + "\nPostagem:\n" + Postagem_dois + "\n" +
                        "\nTitulo:\n" + titulo_postagem_tres + "\nPostagem:\n" + Postagem_tres + "\n");
                        System.exit(0);
                
                }
            
        } else if (opcao.equals("6")) {
                System.out.println("Informe sua senha novamente para encerrar o programa: ");
                String senha_confirmacao = scan.nextLine();

                if (!senha_confirmacao.equals(senha_completa)) {
                    System.out.println("Senha incorreta! Tente novamente.");
                    System.exit(0);
                    
                }

                System.out.println("Saindo do programa. Até logo!");
                System.exit(0);
        
        } else {
                System.out.println("Opção inválida! Tente novamente.");
                System.exit(0);
        }
    }       
}