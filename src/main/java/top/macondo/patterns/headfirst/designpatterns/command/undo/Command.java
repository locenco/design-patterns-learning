package top.macondo.patterns.headfirst.designpatterns.command.undo;

public interface Command {
	public void execute();

	public void undo();
}
