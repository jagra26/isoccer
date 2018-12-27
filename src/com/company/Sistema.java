package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Sistema {
    int login;
    String senha;
    Presidente presidente;
    Tecnico tecnico;
    List<Jogador> time;
    List<Pessoa> funcionarios;
    List<Socio> socios;
    public Sistema(){
        this.login = 123;
        this.senha = "bolinh0";
        this.time = new List<Jogador>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Jogador> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Jogador jogador) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Jogador> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Jogador> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Jogador get(int index) {
                return null;
            }

            @Override
            public Jogador set(int index, Jogador element) {
                return null;
            }

            @Override
            public void add(int index, Jogador element) {

            }

            @Override
            public Jogador remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Jogador> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Jogador> listIterator(int index) {
                return null;
            }

            @Override
            public List<Jogador> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        this.funcionarios = new List<Pessoa>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Pessoa> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Pessoa pessoa) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Pessoa> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Pessoa> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Pessoa get(int index) {
                return null;
            }

            @Override
            public Pessoa set(int index, Pessoa element) {
                return null;
            }

            @Override
            public void add(int index, Pessoa element) {

            }

            @Override
            public Pessoa remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Pessoa> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Pessoa> listIterator(int index) {
                return null;
            }

            @Override
            public List<Pessoa> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        this.socios = new List<Socio>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Socio> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Socio socio) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Socio> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Socio> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Socio get(int index) {
                return null;
            }

            @Override
            public Socio set(int index, Socio element) {
                return null;
            }

            @Override
            public void add(int index, Socio element) {

            }

            @Override
            public Socio remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Socio> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Socio> listIterator(int index) {
                return null;
            }

            @Override
            public List<Socio> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
    }

}
