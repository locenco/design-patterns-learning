package top.macondo.patterns.designpatterns.creational.builder;

import top.macondo.patterns.designpatterns.creational.builder.Package.Packing;

public interface Item {
	public String name();

	public Packing packing();

	public float price();
}
