public class tablero {
    private char casillaBuida = '¶';
    private char[][] tablero;
    private char files ;
    private char columnes ;

public tablero(){
    this.files = '6';
    this.columnes = '7';
}

    private void startTable(){
        tablero = new char[files][columnes];
    }
    public void formatTablero(){
        startTable();
        for(int i = 0 ; i < tablero.length ; i++ ){

        }

    }

    public void funciona(){
        System.out.println(files);
    }
}