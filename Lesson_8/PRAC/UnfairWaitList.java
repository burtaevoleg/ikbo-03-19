package Lesson_8.PRAC;

public class UnfairWaitList<E> extends WaitList<E> {

    /**
     * @see WaitList#WaitList()
     */
    public UnfairWaitList(){
        super();
    }

    /**
     * @param element is an element of the content which we want to delete
     */
    public void remove(E element) {
        if (content.peek() != element) {
            content.remove(element);
        }
    }


    /**
     * @param element is an element which we want to move to the end from the start of content
     */
    public void moveToBack(E element){
        if(contains(element)){
            add(element);
            content.remove(element);
        }
        else{
            add(element);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
