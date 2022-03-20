package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentSkipListSet;


/**
 * Class to hold code used for my practice/experimentation with Java Collections Framework
 *
 * Info on Collection interface: https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html
 * UML Diagram overview of Collections Framework: https://www.codejava.net/images/articles/javacore/collections/collections%20framework%20overview.png
 *
 */
public class CollectionsService {

    private HashSet<String> exampleHashSet;
    private LinkedHashSet<String> exampleLinkedHashSet;
    private TreeSet<String> exampleTreeSet;
    private ConcurrentSkipListSet<String> exampleConcurrentSkipListSet;

    private ArrayList<String> exampleArrayList;
    private Vector<String> exampleVector;
    private LinkedList<String> exampleLinkedList;

    private PriorityQueue<String> examplePriorityQueue;

    private HashMap<Integer, String> exampleHashMap;
    private LinkedHashMap<Integer, String> exampleLinkedHashMap;
    private TreeMap<Integer, String> exampleTreeMap;


    public CollectionsService(){
        exampleHashSet = new HashSet<>();
        exampleLinkedHashSet = new LinkedHashSet<>();
        exampleTreeSet = new TreeSet<>();
        exampleConcurrentSkipListSet = new ConcurrentSkipListSet<>();
        exampleArrayList = new ArrayList<>();
        exampleVector = new Vector<>();
        exampleLinkedList = new LinkedList<>();
        examplePriorityQueue = new PriorityQueue<>();
        exampleHashMap = new HashMap<>();
        exampleLinkedHashMap = new LinkedHashMap<>();
        exampleTreeMap = new TreeMap<>();
    }

    public HashSet<String> getExampleHashSet() {
        return exampleHashSet;
    }

    public void setExampleHashSet(HashSet<String> exampleHashSet) {
        this.exampleHashSet = exampleHashSet;
    }

    public LinkedHashSet<String> getExampleLinkedHashSet() {
        return exampleLinkedHashSet;
    }

    public void setExampleLinkedHashSet(LinkedHashSet<String> exampleLinkedHashSet) {
        this.exampleLinkedHashSet = exampleLinkedHashSet;
    }

    public TreeSet<String> getExampleTreeSet() {
        return exampleTreeSet;
    }

    public void setExampleTreeSet(TreeSet<String> exampleTreeSet) {
        this.exampleTreeSet = exampleTreeSet;
    }

    public ConcurrentSkipListSet<String> getExampleConcurrentSkipListSet() {
        return exampleConcurrentSkipListSet;
    }

    public void setExampleConcurrentSkipListSet(ConcurrentSkipListSet<String> exampleConcurrentSkipListSet) {
        this.exampleConcurrentSkipListSet = exampleConcurrentSkipListSet;
    }

    public ArrayList<String> getExampleArrayList() {
        return exampleArrayList;
    }

    public void setExampleArrayList(ArrayList<String> exampleArrayList) {
        this.exampleArrayList = exampleArrayList;
    }

    public Vector<String> getExampleVector() {
        return exampleVector;
    }

    public void setExampleVector(Vector<String> exampleVector) {
        this.exampleVector = exampleVector;
    }

    public LinkedList<String> getExampleLinkedList() {
        return exampleLinkedList;
    }

    public void setExampleLinkedList(LinkedList<String> exampleLinkedList) {
        this.exampleLinkedList = exampleLinkedList;
    }

    public PriorityQueue<String> getExamplePriorityQueue() {
        return examplePriorityQueue;
    }

    public void setExamplePriorityQueue(PriorityQueue<String> examplePriorityQueue) {
        this.examplePriorityQueue = examplePriorityQueue;
    }

    public HashMap<Integer, String> getExampleHashMap() {
        return exampleHashMap;
    }

    public void setExampleHashMap(HashMap<Integer, String> exampleHashMap) {
        this.exampleHashMap = exampleHashMap;
    }

    public LinkedHashMap<Integer, String> getExampleLinkedHashMap() {
        return exampleLinkedHashMap;
    }

    public void setExampleLinkedHashMap(LinkedHashMap<Integer, String> exampleLinkedHashMap) {
        this.exampleLinkedHashMap = exampleLinkedHashMap;
    }

    public TreeMap<Integer, String> getExampleTreeMap() {
        return exampleTreeMap;
    }

    public void setExampleTreeMap(TreeMap<Integer, String> exampleTreeMap) {
        this.exampleTreeMap = exampleTreeMap;
    }
}

