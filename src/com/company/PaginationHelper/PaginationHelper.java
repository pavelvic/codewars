package com.company.PaginationHelper;

import com.company.KataDescription;

import java.util.List;

@KataDescription(
        name = "PaginationHelper",
        Sensei = "jhoffner",
        kyu = 5,
        link = "https://www.codewars.com/kata/515bb423de843ea99400000a")
public class PaginationHelper<I> {
    private final List<I> collection;
    private final int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (collection.size() % itemsPerPage ) > 0 ? (collection.size() / itemsPerPage) + 1 : collection.size() / itemsPerPage;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        int maxIndex = pageCount() - 1;
        if (pageIndex > maxIndex || collection.size() == 0 || pageIndex < 0) return -1;
        int itemsOnLastPage = collection.size() % itemsPerPage;
        return pageIndex == collection.size() / itemsPerPage ? itemsOnLastPage : itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (collection.size() <= 0 || itemIndex < 0 || itemIndex >= collection.size()) return -1;
        if (itemIndex == 0) return 0;
        return itemIndex / itemsPerPage;
    }
}
