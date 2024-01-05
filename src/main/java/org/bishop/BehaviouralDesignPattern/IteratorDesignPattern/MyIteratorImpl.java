package org.bishop.BehaviouralDesignPattern.IteratorDesignPattern;

import java.util.List;

public class MyIteratorImpl implements MyIterator{

    private List<User> temp;

    private int position =0;
    private int length;

    public MyIteratorImpl(List<User> temp) {
        this.temp = temp;
        this.length=temp.size();
        System.out.println("Temp -> "+temp+" length -> "+length);
    }

    @Override
    public Boolean hasNext() {
       if(this.position <= length-1 &&  temp.get(this.position)!=null )
       {
//           System.out.println("Returning True");
        return true;
       }
       else
       {
//           System.out.println("Returning false");
           return false;
       }
    }

    @Override
    public User next() {
        User user = temp.get(position);
        position++;
        return user;
    }
}
