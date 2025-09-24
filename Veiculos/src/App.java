public class App {
    public static void main(String[] args) throws Exception {
        
        Fabricante fab1 = new Fabricante();
        fab1.setCidade("São Paulo");
        fab1.setCnpj("123321");
        fab1.setId(01);
        fab1.setNome ("Honda");

        
        
        Veiculo carro1 = new Veiculo();
        carro1.setId(01);
        carro1.setAno(2015);
        carro1.setModelo(2015);
        carro1.setNome("Polo");
        carro1.setPlaca("ABC0102");
        carro1.setFabricante (fab1);
        
        imprimirVeiculo( carro1 );



    }
}
