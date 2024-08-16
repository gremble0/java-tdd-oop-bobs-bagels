package com.booleanuk.core;

import java.util.List;

public class Basket {
  private List<StandaloneProduct> products;

  public void add(StandaloneProduct product) {
    this.products.add(product);
  }

  public double price() {
    return this.products.stream().mapToDouble(StandaloneProduct::price).sum();
  }
}
