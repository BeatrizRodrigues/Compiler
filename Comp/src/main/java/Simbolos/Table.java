package Simbolos;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Table {
    private static Table inst;
    private ArrayList<Symbol> list;

    public Table() {
        this.list = new ArrayList<Symbol>();
    }

    public int size() {
        return list.size();
    }

    public int indexOf(Object o) {
        return list.indexOf(o);
    }

    public Symbol get(int i) {
        return list.get(i);
    }

    public Symbol set(int i, Symbol s) {
        return list.set(i, s);
    }

    public boolean add(Symbol s) {
        return list.add(s);
    }

    public void clear() {
        list.clear();
    }

    public void forEach(Consumer<? super Symbol> cnsmr) {
        list.forEach(cnsmr);
    }

    public static synchronized Table getInstance() {
        if (inst == null) {
            inst = new Table();
        }

        return inst;
    }
}
