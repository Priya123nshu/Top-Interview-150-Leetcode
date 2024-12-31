class RandomizedSet {
    HashSet<Integer> k = new HashSet();
        public RandomizedSet() {
            //HashSet<Integer> k = new HashSet();
        }
        
        public boolean insert(int val) {
            if(k.contains(val))
            {
                return false;
            }
            k.add(val);
            return true;
        }
        
        public boolean remove(int val) {
            if(k.contains(val))
            {
                k.remove(val);
                return true;
            }
            return false;
        }
        
        public int getRandom() {
            ArrayList<Integer> p = new ArrayList<>();
            for(Integer e: k)
            {
                p.add(e);
            }
            Random random = new Random();
            int randomindex = random.nextInt(p.size());
            return p.get(randomindex);
        }
    }