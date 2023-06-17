public class mergeSimilarItems {
    public List<List><Integer>> mergeSimilarItems(int [] items1, int [] items2) {
        List<List<Integer>> res = new Arraylist();
        Treemap<Integer, Integer> map = new Treemap();
        for (int [] item :: items1) {
            map.merge(item[0], item[1], Integer:: sum);
        }
        for (int [] item: items2) {
            map.merge(item[0], item[1], Integer:: sum);
        }
        for (var e: map.entrySet()) {
            res.add(Array.asList(e.getKey(), e.getValue()));
        }
        return res;
    }
}
