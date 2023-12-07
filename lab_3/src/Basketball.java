class Basketball extends Sport {
    private int basketHeight;

    Basketball() {
        super();
        this.basketHeight = 0;
    }

    int getBasketHeight() {
        return basketHeight;
    }

    void setBasketHeight(int basketHeight) {
        this.basketHeight = basketHeight;
    }

    // Додатковий метод для класу Basketball
    void performSpecificBasketballLogic() {
        System.out.println("Performing specific basketball logic...");
    }
}
