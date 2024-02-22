public class tablero {
    private char casillaBuida = '|';
    private char[][] tablero ;
    private int files ;
    private int columnes ;

    public tablero(){
        this.files = 6;
        this.columnes = 7;
        startTable(this.files , this.columnes);
    }
    private void startTable(int files, int columnes){
        tablero = new char[files][columnes];
    }

  public void imprimirTaula(){
       String render = "";

      for (int i = 0; i <tablero.length ; i++) {

          for (int j = 0; j < tablero[i].length; j++) {
              render += " | ";
              if (tablero[i][j] == 0) {
                  render += tablero[i][j];
              }else {
                  render += "";
              }
          }
          render += " |  " + " \n";
      }
      System.out.println(render);
  }
}