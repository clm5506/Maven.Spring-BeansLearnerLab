package com.example.demo;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    private List<PersonType> list;

    public People(List<PersonType> list) {
        this.list = list;
    }

    public void add(PersonType p){
        list.add(p);
    }

    public void remove(PersonType p){
        list.remove(p);
    }

    public Integer size(){
        return list.size();
    }

    public void clear(){
        list.clear();
    }

    public void addAll(Iterable<PersonType> ptypes){
        list.addAll((Collection<? extends PersonType>) ptypes);
    }

    public PersonType findById(Long id){
        for(PersonType p : list){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public List<PersonType> findAll(){
        return list;
    }
    @Override
    public Iterator<PersonType> iterator() {
        return list.iterator();
    }


}
