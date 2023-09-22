import java.util.ArrayList;
public class operarCompras {
    ArrayList<listaDeCompras> compras =  new ArrayList<listaDeCompras>();
    public void adicionarItem(listaDeCompras item){

        compras.add(item);
        System.out.println("item: "+item.nomeItem+" foi adicionado em sua lista");
    }

    public ArrayList<listaDeCompras> listarItens(){
        ArrayList lista = compras;
        System.out.println("Sua lista Possui esses itens");
        for (listaDeCompras item : compras) {
            System.out.println( "Número do item: " + (compras.indexOf(item)+1) + " --- "+ item.nomeItem + " | valor: "+ item.valor + "| qtd: " + item.quantidade);
        }
        return lista;
    }

    public void editarValorItem(listaDeCompras compra, int numeroItem, Double valor){
        listaDeCompras c = new listaDeCompras(compra.nomeItem, valor, compra.quantidade);
        compras.set(numeroItem-1, c);
        System.out.println("item: "+numeroItem+" foi editado em sua lista");
    }

    public void editarQuantidadeItem(listaDeCompras compra, int numeroItem, int quantidade){
        listaDeCompras c = new listaDeCompras(compra.nomeItem, compra.valor, quantidade);
        compras.set(numeroItem-1, c);
        System.out.println("item: "+numeroItem+" foi editado em sua lista");
    }

    public void editarItem(listaDeCompras compra, int numeroItem, String nomeItem){
        listaDeCompras c = new listaDeCompras(nomeItem, compra.valor, compra.quantidade);
        compras.set(numeroItem-1, c);
        System.out.println("item: "+numeroItem+" foi editado em sua lista");
    }
    public void excluirItem(int numeroItem){
        compras.remove(numeroItem-1);
        System.out.println("item: "+numeroItem+" foi removido em sua lista");
    }

    public void calcularLista(){
        double calculo = 0;
        ArrayList lista = compras;
        for (listaDeCompras item : compras) {
            calculo += (item.valor * item.quantidade);
        }
        System.out.println("O valor da sua lista de compras é de R$ : "+Math.ceil(calculo));
    }

}
