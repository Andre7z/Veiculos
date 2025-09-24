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
        
        carro1.imprimirVeiculo();
        
        Veiculo carro2 = new Veiculo();
        carro2.setId(02);
        carro2.setAno(2018);
        carro2.setModelo(2018);
        carro2.setNome("Civic");
        carro2.setPlaca("DEF1234");
        carro2.setFabricante(fab1);

        carro2.imprimirVeiculo();

    }
}
