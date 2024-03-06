class Link
    {
        public int Data; // data item (key)
        public Link next; // next link in list
    // -------------------------------------------------------------
    public Link(int id) // constructor
    {
        Data = id;

    }
    // -------------------------------------------------------------
    public void displayLink() // display ourself
    {
        System.out.print("{" + Data +  "} ");
    }
} // end class Link

    ////////////////////////////////////////////////////////////////
class LinkList
{
    private Link first; // ref to first link
    private Link last; // ref to last link
    // -------------------------------------------------------------
    public LinkList() // constructor
    {
        first = null; // no links on list yet
        last = null;
    }
    // -------------------------------------------------------------
    public boolean isEmpty() // true if no links
    {
        return first==null; 
    }
// -------------------------------------------------------------
    public void insertFirst(int dd) // insert at front of list
    {
        Link newLink = new Link(dd); // make new link
        if( isEmpty() ) // if empty list,
            last = newLink; // newLink <-- last
        newLink.next = first; // newLink --> old first
        first = newLink; // first --> newLink
    }
// -------------------------------------------------------------
    public void insertLast(int dd) // insert at end of list
    {
        Link newLink = new Link(dd); // make new link
        if( isEmpty() ) // if empty list,
            first = newLink; // first --> newLink
        else
            last.next = newLink; // old last --> newLink
        last = newLink; // newLink <-- last
    }
// -------------------------------------------------------------
public long deleteFirst() // delete first link
    { // (assumes non-empty list)
        long temp = first.Data;
        if(first.next == null) // if only one item
            last = null; // null <-- last
        first = first.next; // first --> old next
        return temp;
    }
// -------------------------------------------------------------
public long deleteLast() // delete first link
    { // (assumes non-empty list)
        long temp = last.Data;
        if(first.Data == last.Data){ // if only one item
            last = null; // null <-- last
            first=null;
        }
        else{
            Link current=first;
            while(current.next!=null){
                if(current.next.next.Data==last.Data){
                    current.next.next=null;
                    last=current.next;
                     break;
                }else
                current=current.next;
            }
        }
        
        return temp;
    }
// -------------------------------------------------------------


    public Link find(int key) // find link with given key
    { // (assumes non-empty list)
        Link current = first; // start at ‘first’
        while(current.Data != key) // while no match,
        {
        if(current.next == null) // if end of list,
            return null; // didn’t find it
        else // not end of list,
            current = current.next; // go to next link
        }
            return current; // found it
    }
    // -------------------------------------------------------------
    public Link delete(int key) // delete link with given key
    { // (assumes non-empty list)
        Link current = first; // search for link
        Link previous = first;
        while(current.Data != key)
        {
            if(current.next == null)
                return null; // didn’t find it
            else
            {
                previous = current; // go to next link
                current = current.next;
            }
        } // found it
        if(current == first) // if first link,
            first = first.next; // change first
        else // otherwise,
            previous.next = current.next; // bypass it
        return current;
    }
    // -------------------------------------------------------------
    public void displayList()
    {
        System.out.print("List (first-->last): ");
        Link current = first; // start at beginning
        while(current != null) // until end of list,
        {
            current.displayLink(); // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }

// -------------------------------------------------------------
    public void firsElement(){
        System.out.print("first element is:");
        first.displayLink();
        System.out.println();
    }

    public void lastElement(){
        System.out.print("first element is:");
        last.displayLink();
        System.out.println();
    }
// -------------------------------------------------------------
} // end class LinkList
////////////////////////////////////////////////////////////////
class DoubleEndedLinkedList
{
    public static void main(String[] args)
    { // make a new list
        LinkList theList = new LinkList();
        theList.insertFirst(22); // insert at front
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertLast(11); // insert at rear
        theList.insertLast(33);
        theList.insertLast(55);
        theList.displayList(); // display the list
        theList.lastElement();
        // theList.deleteFirst(); // delete first two items
        theList.deleteFirst();
          theList.deleteLast();
        theList.displayList(); // display again
        theList.lastElement();
        theList.firsElement();
    } // end main()
} // end class FirstLastApp