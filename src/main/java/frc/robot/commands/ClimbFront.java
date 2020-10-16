package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ClimbFront extends Command
{
    private boolean on;
    public ClimbFront()
    {
        on = false;

        // System.out.println("front climber up");
        // Value val = on ? Value.kForward: Value.kReverse;
        // Robot.m_ClimbingSubsystem.setFrontLeg(val);
    }
    public ClimbFront(boolean on)
    {
        this.on = on;
    }
    protected void execute()
    {
        on = !on;
        
        System.out.println("front climber up: " + on);
        Value val = on ? Value.kForward: Value.kReverse;
        Robot.m_ClimbingSubsystem.setFrontLeg(val);
    }

    @Override
    protected boolean isFinished() {
        return true;
    }

}