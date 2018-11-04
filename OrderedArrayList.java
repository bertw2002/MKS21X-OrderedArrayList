public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public int whatindex(T element){
    if (element == null){
      throw new IllegalArgumentException();
    }
    for (int x = 0;x < super.size() - 1; x++){
      if (element.compareTo(super.get(x)) >= 0 && element.compareTo(super.get(x + 1)) <= 0){
        return x + 1;
      }
    }

    if (super.size() > 0){
      if (element.compareTo(super.get(0)) <= 0){
        return 0;
      }
    }
    return -1;
  }
  public boolean add(T element){
    if (element == null){
      throw new IllegalArgumentException();
    }
    if (whatindex(element) == -1){
      super.add(element);
      return true;
    }
    super.add(whatindex(element), element);
    return true;
  }

  public void add(int index, T element){
    if (element == null){
      throw new IllegalArgumentException();
    }
    if (whatindex(element) == super.size()){
      super.add(element);
    }
    super.add(whatindex(element), element);

  }

  public void sorted(T element){
    if (element.compareTo(super.get(0)) <= 0){
      super.add(0, element);
    }else if(element.compareTo(super.get(super.size() - 1)) >= 0){
      super.add(element);
    }else{
      for (int x = 0; x < super.size() - 1; x++){
        if (element.compareTo(super.get(x)) >= 0 && element.compareTo(super.get(x + 1)) <= 0){
          super.add(x + 1, element);
          break;
        }
      }
    }
  }
  public T set(int index, T element){
    if (index >= super.size()){
      throw new IndexOutOfBoundsException();
    }
    T var = super.set(index, element);
    super.remove(index);
    sorted(element);
    return var;
  }
}
