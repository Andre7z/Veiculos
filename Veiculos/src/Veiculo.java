public class Veiculo{

    private int id ;
    private String placa;
    private String nome;
    private int ano;
    private int modelo;
    private Fabricante fabricante;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public Fabricante getFabricante() {
        return fabricante;
    }
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    
    
    
        public void imprimirVeiculo(){
            System.out.println("---Veiculo---");
            System.out.println("Nome: " + getNome());
            System.out.println("ID: " + getId());
            System.out.println("Modelo: " + getModelo());
            System.out.println("Nome: " + getNome());
            System.out.println ("Placa: " + getPlaca());
            System.out.println ("/n ---Fabricante--- /nNome:" + getFabricante.getNome());
            System.out.println("Ano: " + getFabricante.getAno());
            System.out.println ("Cidade: " + getFabricante.getCidade());
            System.out.println("CNPJ: " + getFabricante.getCnpj());
            
        }
}