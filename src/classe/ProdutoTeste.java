package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Notebook");
        //p1.nome = "Notebook";
        p1.preco = 4356.89;
        //p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        //p2.desconto = 0.29;

        Produto.desconto = 0.5;

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.println();
        System.out.printf(p1.nome+" R$ %.2f\n", precoFinal1);
        System.out.printf(p2.nome+" R$ %.2f\n",precoFinal2);
        System.out.printf("Média do carrinho = R$ %.2f.", mediaCarrinho);
        System.out.println();
    


    }
}