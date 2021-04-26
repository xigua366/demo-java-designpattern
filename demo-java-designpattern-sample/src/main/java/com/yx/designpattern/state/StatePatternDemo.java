package com.yx.designpattern.state;

/**
 *
 * <p>
 *
 * 其实状态模式，就是维护多种不同的状态，每种状态下可以去执行一些特殊的逻辑。然后由一个Context类负责根据请求参数调用，来维护这些状态之间的切换，形成一个状态机的概念。
 *
 * 状态模式里，非常重要的一点就是将状态之间流转的逻辑，封装在Context类里面。本来可能需要调用方自己维护复杂的状态流转逻辑，流转到不同的状态之后，执行状态对应的代码逻辑。
 *
 * 这个状态模式，在电商系统中有天然的运用场景，我们的系统中很多数据都有大量的状态变更的逻辑，我们可以将状态变更的逻辑用状态模式来实现，将状态流转封装在一个地方，每次状态变更就通知那个组件，让状态流转，同时执行状态对应的代码逻辑
 *
 * <p/>
 *
 * @author Xi.Yang
 *
 */
public class StatePatternDemo {
	
	public static void main(String[] args) {
		Context context = new Context(new NewState());
		context.execute(1); 
		context.execute(2); 
		context.execute(3); 
		
		// 适合场景，数据有状态，状态就一定会流转，从状态1变成状态2
		// 将不同的状态要执行的代码逻辑封装在不同的state类中
		// 有一个context类，负责根据传入的参数，决定这份数据的状态流转到什么状态
		// 同时负责执行那个新状态的代码逻辑
		
		// 适合的场景太明显了，只要有状态，都按照标准的状态模式来实现，改进
		// 不同的状态逻辑放不同的state类
		// 有一个类负责状态之间的流转以及状态逻辑的执行
		
		// 对于有状态的场景，按照面向对象的思想来设计，而不是说，在一堆代码里面
		// if 开始执行那个状态的一堆逻辑，else if，开始执行另外一个状态的一堆逻辑，屎一样的代码
		// 代码很清晰，可读性很好，可维护性很好
	}
	
	public interface State {
		
		void execute();
		
	}
	
	public static class NewState implements State {

		@Override
		public void execute() {
			System.out.println("执行销售出库单新建状态的逻辑");  
		}
		
	}
	
	public static class ApprovingState implements State {

		@Override
		public void execute() {
			System.out.println("执行销售出库单待审批状态的逻辑");  
		}
		
	}
	
	public static class ApprovedState implements State {

		@Override
		public void execute() {
			System.out.println("执行销售出库单已审批状态的逻辑");  
		}
		
	}
	
	public static class FinishedState implements State {

		@Override
		public void execute() {
			System.out.println("执行销售出库单已完成状态的逻辑");  
		}
		
	}

	/**
	 * Context 表示上下文业务，在实际项目中，一般就是我们的Service实现类
	 */
	public static class Context {
		
		private State state;
		
		public Context(State state) {
			this.state = state;
			this.state.execute();
		}
		
		public void execute(int stateType) {
			if(stateType == 1) {
				this.state = new ApprovingState();
				this.state.execute();
			} else if(stateType == 2) {
				this.state = new ApprovedState();
				this.state.execute();
			} else if(stateType == 3) {
				this.state = new FinishedState();
				this.state.execute();
			}
		}
		
	}
	
}
