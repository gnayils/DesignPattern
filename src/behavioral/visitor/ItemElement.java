package behavioral.visitor;

public interface ItemElement {

    int accept(ShoppingCartVisitor visitor);
}
