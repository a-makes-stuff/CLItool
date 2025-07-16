import java.util.*;
public class JSONParser{
        HashMap<Integer,String> stringIndex = new HashMap<>();
        String[] args = null;
        final Set<String> ops = Set.of("-add","-delete","-mark-done","-mark-in-progress","-update","-listdone","-listall","-listpending","-help","-exit");
        boolean valid=false;
        //the above set of implements a java internal immutable class, works good for our final variable "ops"
        JSONParser(String[] terms) {
            this.args= terms;
            stringIndex.clear();
            for(int i=0;i<args.length;i++){
                stringIndex.put(i,args[i]);
            }
            valid = Chkops(ops,stringIndex);
        }
        final Boolean Chkops(Set<String> Operation,HashMap<Integer,String> Indices){
            Set<String> Arguments = new HashSet(Indices.values()); //the indices.values() is a collection, so to convert to a set, we use hashset
            Arguments.retainAll(Operation);
            return Arguments.size()==1;
        }
        void add(String input){

        }
        void delete(String taskName){

        }
        void update(String taskName){

        }
        void markDone(String taskName){

        }
        void markInProgress(String task){

        }
        void list(){
            done();
            inProgress();
            all();

        }
        void done(){

        }
        void inProgress(){

        }
        void all(){

        }
        void help(){

        }
        void exit(){

        }

    }