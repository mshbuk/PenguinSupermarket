package pgdp.collections;

public class DataStructureLink<T> {
    private DataStructureConnector<T> A;
    private DataStructureConnector<T> B;

    public DataStructureLink(DataStructureConnector<T> A,DataStructureConnector<T> B) {
       // this.A = A;
      //  this.B = B;
    }

    public boolean moveNextFromAToB() {
      //  if(!A.hasNextElement()) return false;
    //    else {
     //       T obj = A.removeNextElement();
      //      B.addElement(obj);
     //       return true;
    //    }
        return false;}
    public void moveAllFromAToB() {
   // while(!(A.hasNextElement())) {
     //   T obj = A.removeNextElement();
     //   B.addElement(obj);
   // }
    }
}
