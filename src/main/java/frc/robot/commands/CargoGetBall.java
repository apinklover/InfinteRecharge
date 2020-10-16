package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class CargoGetBall extends Command {
    private double speed;

    public CargoGetBall(double speed){
        super();
        this.speed = speed;
    }

    @Override
    protected boolean isFinished() {
        return stopCalled;
    }

    public void execute(){
        Robot.cHandler.cargoGetBall().set(speed);
        //Robot.cHandler.cargoRight().set(-1 * speed);
    }
    
    private boolean stopCalled = false;
    public void stopExecuting()
    {
        //Robot.cHandler.cargoLeft().set(0);
        Robot.cHandler.cargoGetBall().set(0);
        stopCalled = true;
    }
}