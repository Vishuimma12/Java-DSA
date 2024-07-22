
class linearS {
    public static int update(int num[], int key){
        for(int i=0; i<num.length; i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {134,12,3,24,54,62,73,8,93,10};
        int k = 62;
        int index = update(nums,k);
        System.out.println(index);
    }
}