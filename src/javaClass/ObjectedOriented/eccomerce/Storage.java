package javaClass.ObjectedOriented.eccomerce;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Storage {

    private Set<StorageItem> items = new HashSet<>();

    public void load(Product product, int quantity) {
        /*
         * 
         * Optional<StorageItem> tmp = find(product);
         * StorageItem.it;
         * if(tmp.isPresent()){
         * it = tmp.get();
         * it.setQuantity(it.getQuantity() + quantity);
         * } else {
         * it = new StorageItem(product, quantity);
         * 
         * items.add(it);
         * }
         */

        StorageItem item = find(product)
                .orElse(new StorageItem(product, 0));
        item.setQuantity(item.getQuantity() + quantity);
        items.add(item);
    }

    public void unload(Product product, int quantity) {
        StorageItem item = isAvailable(product, quantity);
        item.setQuantity(item.getQuantity() - quantity);

    }

    public StorageItem isAvailable(Product product, int quantity) {

        StorageItem found = find(product).orElseThrow(() -> new StorageException(("product dont exist")));
        if (found.getQuantity() >= quantity) {
            throw new StorageException("quantity in not sufficient");
        }
        return found;
    }

    public void discontinue(Product product) {
        StorageItem found = find(product).orElseThrow(() -> new StorageException("product dont exist"));
        found.discontinue();
    }

    private Optional<StorageItem> find(Product p) {
        return items.stream()
                .filter(v -> v.getProduct().equals(p))
                .findFirst();
    }

    public void logStatus() {
        System.out.println("---------STORAGE STATUS----------");
        items.forEach(System.out::println);
        System.out.println("---------STORAGE STATUS----------");
    }

    public List<Product> findByName(String name) {
        return items.stream()
                .filter(v -> v.getProduct().getName().contains(name))
                .map(v -> v.getProduct())
                .collect(Collectors.toList());
    }

    public List<Product> findByNameAndAvailabilties(String name, int quantity) {
        return items.stream()
                .filter(v -> v.getProduct().getName().contains(name) && v.getQuantity() > quantity)
                .map(v -> v.getProduct())
                .collect(Collectors.toList());
    }

}

/*
 * private Optional<StorageItem> findOldJava(Product product){
 * Optional<StorageItem> result = Optional.empty();
 * 
 * for(StorageItem item: items){
 * if (item.getProduct().equals(result)){
 * result = Optional.of(item);
 * break;
 * }
 * }
 * return result;
 * }
 */
