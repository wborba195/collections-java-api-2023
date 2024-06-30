package main.java.list.OperacoesBasicasWill;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }
    
    public void setItemList(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    

}
