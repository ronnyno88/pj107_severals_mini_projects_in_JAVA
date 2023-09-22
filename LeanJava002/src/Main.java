public class Main {
    public static void main(String[] args) {
        operarCompras op = new operarCompras();
        listaDeCompras item01 = new listaDeCompras("Arroz", 8.59, 10);
        listaDeCompras item02 = new listaDeCompras("Farinha", 2.39, 2);
        listaDeCompras item03 = new listaDeCompras("Açucar", 6.99, 5);
        listaDeCompras item04 = new listaDeCompras("Café", 4.99, 2);
        listaDeCompras item05 = new listaDeCompras("Leite", 5.19, 5);

        op.adicionarItem(item01);
        op.adicionarItem(item02);
        op.adicionarItem(item03);
        op.adicionarItem(item04);
        op.adicionarItem(item05);
        System.out.println("=================================================");
        op.listarItens();
        System.out.println("=================================================");
        op.calcularLista();
        System.out.println("=================================================");
        op.editarValorItem(item02, 2, 2.69);
        op.editarQuantidadeItem(item01, 1, 8);
        op.editarItem(item03, 3, "Feijão");
        System.out.println("=================================================");
        op.listarItens();
        System.out.println("=================================================");
        op.calcularLista();
        System.out.println("=================================================");
        op.excluirItem(3);
        System.out.println("=================================================");
        op.listarItens();
        System.out.println("=================================================");
        op.calcularLista();


    }
}