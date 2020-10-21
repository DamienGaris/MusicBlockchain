package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String args[]) {

        Blockchain musicCoin = new Blockchain();

        Transaction transaction1 = new Transaction("Universal","Simon","One Dance", "Drake","OVO Sound","Yes") ;
        Transaction transaction2 = new Transaction("Simon","Damien","Laziz", "Simon","","No") ;
        Transaction transaction3 = new Transaction("Simon","Universal","Laziz", "Simon","","No") ;

        List listTransaction = new ArrayList();
        listTransaction.add(transaction1);

        List listTransaction2 = new ArrayList();
        listTransaction2.add(transaction2);

        List listTransaction3 = new ArrayList();
        listTransaction3.add(transaction2);
        listTransaction3.add(transaction3);

        Block a = new Block("0x200", new java.util.Date(),"<Transacions>", listTransaction);
        Block b = new Block("0x200", new java.util.Date(), "<Transacions>",listTransaction2);
        Block c = new Block("0x200", new java.util.Date(), "<Transacions>",listTransaction3);

        musicCoin.addBlock(a);
        musicCoin.addBlock(b);
        musicCoin.addBlock(c);

        //musicCoin.getLatestBlock().setPreviousHash("ABCDEFG");

        musicCoin.displayChain();

        musicCoin.isValid();

    }


}
