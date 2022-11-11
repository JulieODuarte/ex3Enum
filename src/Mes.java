public enum Mes {
    JANEIRO(1000),
    FEVEREIRO(1200),
    MARCO(1400),
    ABRIL(1600),
    MAIO(1800),
    JUNHO(2000),
    JULHO(2200),
    AGOSTO(2400),
    SETEMBRO(2600),
    OUTUBRO(2800),
    NOVEMBRO(3000),
    DEZEMBRO(3200);

    private float valor;

    Mes (float valor){
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }
}
