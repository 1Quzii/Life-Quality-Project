package life;
import java.util.*;
public class LifeMain extends LifeSleep {

	
	public static void main(String[] args) {
		LifeMain.greeting();
		LifeMain.l2();
		LifeMain.discreption();
		LifeMain.l2();
		LifeMain.warning();
		LifeMain.l3();
		Scanner v = new Scanner (System.in);
		LifeMain u = new LifeMain();
		LifeMain.name();
		u.name = v.next();
		u.userWelcoming();
		LifeMain.genral();
		LifeMain.l2();
		u.age();
		u.age = v.nextByte();
		if (u.age >= 20) {
			LifeMain.l2();
			u.hight();
			u.hight = v.nextShort();
			LifeMain.l2();
			u.wight();
			u.wight = v.nextInt();
			u.idealWight();
			LifeMain.l3();
			u.cal();
			u.cal = v.nextShort();
			if (u.cal <= 3000) {
				if (u.cal >= 1600) {
					u.growncal();
					LifeMain.helthyTips();
					LifeMain.foodTips();
					LifeMain.l3();
					LifeMain.sleepInfo();
					u.sleepTime();
					u.sleepinHours = v.nextByte();
					if (u.sleepinHours >= 7) {
						if (u.sleepinHours <= 8) {
							u.goodSleepGrowen();
							LifeMain.phoneAddiction();
							u.phoneAddictionTest();
							u.phoneUse = v.nextShort();
							if (u.phoneUse <= 5) {
								u.phoneAddictionGood();
							}
							if (u.phoneUse > 5) {
								u.phoneAddictionBad();
							}
						}
						
					}
					if (u.sleepinHours < 7) {
						u.moreSleepGrowen();
						LifeMain.phoneAddiction();
						u.phoneAddictionTest();
						u.phoneUse = v.nextShort();
						if (u.phoneUse <= 5) {
							u.phoneAddictionGood();
						}
						if (u.phoneUse > 5) {
							u.phoneAddictionBad();
						}
					}
					if (u.sleepinHours > 8) {
						u.lessSleepGrowen();
						LifeMain.phoneAddiction();
						u.phoneAddictionTest();
						u.phoneUse = v.nextShort();
						if (u.phoneUse <= 5) {
							u.phoneAddictionGood();
						}
						if (u.phoneUse > 5) {
							u.phoneAddictionBad();
						}
					}
				}
			}
			if (u.cal > 3000) {
				u.grownOvercal();
				u.growncal();
				LifeMain.helthyTips();
				LifeMain.foodTips();
				LifeMain.l3();
				LifeMain.sleepInfo();
				u.sleepTime();
				u.sleepinHours = v.nextByte();
				if (u.sleepinHours >= 7) {
					if (u.sleepinHours <= 8) {
						u.goodSleepGrowen();
						LifeMain.phoneAddiction();
						u.phoneAddictionTest();
						u.phoneUse = v.nextShort();
						if (u.phoneUse <= 5) {
							u.phoneAddictionGood();
						}
						if (u.phoneUse > 5) {
							u.phoneAddictionBad();
						}
					}
					
				}
				if (u.sleepinHours < 7) {
					u.moreSleepGrowen();
					LifeMain.phoneAddiction();
					u.phoneAddictionTest();
					u.phoneUse = v.nextShort();
					if (u.phoneUse <= 5) {
						u.phoneAddictionGood();
					}
					if (u.phoneUse > 5) {
						u.phoneAddictionBad();
					}
				}
				if (u.sleepinHours > 8) {
					u.lessSleepGrowen();
					LifeMain.phoneAddiction();
					u.phoneAddictionTest();
					u.phoneUse = v.nextShort();
					if (u.phoneUse <= 5) {
						u.phoneAddictionGood();
					}
					if (u.phoneUse > 5) {
						u.phoneAddictionBad();
					}
				}
			}
			if (u.cal < 1600) {
				u.growUnderncal();
				u.growncal();
				LifeMain.helthyTips();
				LifeMain.foodTips();
				LifeMain.l3();
				LifeMain.sleepInfo();
				u.sleepTime();
				u.sleepinHours = v.nextByte();
				if (u.sleepinHours >= 7) {
					if (u.sleepinHours <= 8) {
						u.goodSleepGrowen();
						LifeMain.phoneAddiction();
						u.phoneAddictionTest();
						u.phoneUse = v.nextShort();
						if (u.phoneUse <= 5) {
							u.phoneAddictionGood();
						}
						if (u.phoneUse > 5) {
							u.phoneAddictionBad();
						}
					}
					
				}
				if (u.sleepinHours < 7) {
					u.moreSleepGrowen();
					LifeMain.phoneAddiction();
					u.phoneAddictionTest();
					u.phoneUse = v.nextShort();
					if (u.phoneUse <= 5) {
						u.phoneAddictionGood();
					}
					if (u.phoneUse > 5) {
						u.phoneAddictionBad();
					}
				}
				if (u.sleepinHours > 8) {
					u.lessSleepGrowen();
					LifeMain.phoneAddiction();
					u.phoneAddictionTest();
					u.phoneUse = v.nextShort();
					if (u.phoneUse <= 5) {
						u.phoneAddictionGood();
					}
					if (u.phoneUse > 5) {
						u.phoneAddictionBad();
					}
				}
			}
		}


		if (u.age <= 19) {
			if (u.age >= 13) {
				LifeMain.l2();
				u.hight();
				u.hight = v.nextShort();
				LifeMain.l2();
				u.wight();
				u.wight = v.nextInt();
				u.idealWight();
				LifeMain.l3();
				u.cal();
				u.cal = v.nextShort();
				if (u.cal <= 1800) {
					if (u.cal >= 1000) {
						u.teencal();
						LifeMain.helthyTips();
						LifeMain.foodTips();
						LifeMain.l3();
						LifeMain.sleepInfo();
						u.sleepTime();
						u.sleepinHours = v.nextByte();
						if (u.sleepinHours >= 9) {
							if (u.sleepinHours <= 10) {
								u.goodSleepTeen();
								LifeMain.phoneAddiction();
								u.phoneAddictionTest();
								u.phoneUse = v.nextShort();
								if (u.phoneUse <= 5) {
									u.phoneAddictionGood();
								}
								if (u.phoneUse > 5) {
									u.phoneAddictionBad();
								}
							}
							
						}
						if (u.sleepinHours < 9) {
							u.moreSleepTeen();
							LifeMain.phoneAddiction();
							u.phoneAddictionTest();
							u.phoneUse = v.nextShort();
							if (u.phoneUse <= 5) {
								u.phoneAddictionGood();
							}
							if (u.phoneUse > 5) {
								u.phoneAddictionBad();
							}
						}
						if (u.sleepinHours > 10) {
							u.lessSleepTeen();
							LifeMain.phoneAddiction();
							u.phoneAddictionTest();
							u.phoneUse = v.nextShort();
							if (u.phoneUse <= 5) {
								u.phoneAddictionGood();
							}
							if (u.phoneUse > 5) {
								u.phoneAddictionBad();
							}
						}
					}
				}
				if (u.cal > 1800) {
					u.teenOvercal();
					u.teencal();
					LifeMain.helthyTips();
					LifeMain.foodTips();
					LifeMain.l3();
					LifeMain.sleepInfo();
					u.sleepTime();
					u.sleepinHours = v.nextByte();
					if (u.sleepinHours >= 9) {
						if (u.sleepinHours <= 10) {
							u.goodSleepTeen();
							LifeMain.phoneAddiction();
							u.phoneAddictionTest();
							u.phoneUse = v.nextShort();
							if (u.phoneUse <= 5) {
								u.phoneAddictionGood();
							}
							if (u.phoneUse > 5) {
								u.phoneAddictionBad();
							}
						}
						
					}
					if (u.sleepinHours < 9) {
						u.moreSleepTeen();
						LifeMain.phoneAddiction();
						u.phoneAddictionTest();
						u.phoneUse = v.nextShort();
						if (u.phoneUse <= 5) {
							u.phoneAddictionGood();
						}
						if (u.phoneUse > 5) {
							u.phoneAddictionBad();
						}
					}
					if (u.sleepinHours > 10) {
						u.lessSleepTeen();
						LifeMain.phoneAddiction();
						u.phoneAddictionTest();
						u.phoneUse = v.nextShort();
						if (u.phoneUse <= 5) {
							u.phoneAddictionGood();
						}
						if (u.phoneUse > 5) {
							u.phoneAddictionBad();
						}
					}
				}
				if (u.cal < 1000) {
					u.teeUnderncal();
					u.teencal();
					LifeMain.helthyTips();
					LifeMain.foodTips();
					LifeMain.l3();
					LifeMain.sleepInfo();
					u.sleepTime();
					u.sleepinHours = v.nextByte();
					if (u.sleepinHours >= 9) {
						if (u.sleepinHours <= 10) {
							u.goodSleepTeen();
							LifeMain.phoneAddiction();
							u.phoneAddictionTest();
							u.phoneUse = v.nextShort();
							if (u.phoneUse <= 5) {
								u.phoneAddictionGood();
							}
							if (u.phoneUse > 5) {
								u.phoneAddictionBad();
							}
						}
						
					}
					if (u.sleepinHours < 9) {
						u.moreSleepTeen();
						LifeMain.phoneAddiction();
						u.phoneAddictionTest();
						u.phoneUse = v.nextShort();
						if (u.phoneUse <= 5) {
							u.phoneAddictionGood();
						}
						if (u.phoneUse < 5) {
							u.phoneAddictionBad();
						}
					}
					if (u.sleepinHours > 10) {
						u.lessSleepTeen();
						LifeMain.phoneAddiction();
						u.phoneAddictionTest();
						u.phoneUse = v.nextShort();
						if (u.phoneUse <= 5) {
							u.phoneAddictionGood();
						}
						if (u.phoneUse > 5) {
							u.phoneAddictionBad();
							System.out.println("Thank you for using this program.");

						}
					}
				}
				
			}
		}
		if (u.age <= 12) {
			if (u.age >= 6) {
				LifeMain.l2();
				u.hight();
				u.hight = v.nextShort();
				LifeMain.l2();
				u.wight();
				u.wight = v.nextInt();
				u.idealWight();
				LifeMain.l3();
				u.cal();
				u.cal = v.nextShort();
				if (u.cal <= 3000) {
					if (u.cal >= 1600) {
						u.childcal();
						LifeMain.helthyTips();
						LifeMain.foodTips();
						LifeMain.l3();
						LifeMain.sleepInfo();
						u.sleepTime();
						u.sleepinHours = v.nextByte();
						if (u.sleepinHours >= 10) {
							if (u.sleepinHours <= 11) {
								u.goodSleepChild();
								LifeMain.phoneAddiction();
								u.phoneAddictionTest();
								u.phoneUse = v.nextShort();
								if (u.phoneUse <= 5) {
									u.phoneAddictionGood();
									System.out.println("Thank you for using this program.");

								}
								if (u.phoneUse > 5) {
									u.phoneAddictionBad();
									System.out.println("Thank you for using this program.");

								}
							}
							
						}
						if (u.sleepinHours < 10) {
							u.moreSleepChild();
							LifeMain.phoneAddiction();
							u.phoneAddictionTest();
							u.phoneUse = v.nextShort();
							if (u.phoneUse <= 5) {
								u.phoneAddictionGood();
								System.out.println("Thank you for using this program.");

							}
							if (u.phoneUse > 5) {
								u.phoneAddictionBad();
								System.out.println("Thank you for using this program.");

							}
						}
						if (u.sleepinHours > 11) {
							u.lessSleepChild();
							LifeMain.phoneAddiction();
							u.phoneAddictionTest();
							u.phoneUse = v.nextShort();
							if (u.phoneUse <= 5) {
								u.phoneAddictionGood();
								System.out.println("Thank you for using this program.");

							}
							if (u.phoneUse > 5) {
								u.phoneAddictionBad();
								System.out.println("Thank you for using this program.");

							}
						}
					}
				}
				if (u.cal > 3000) {
					u.childOvercal();
					u.childcal();
					LifeMain.helthyTips();
					LifeMain.foodTips();
					LifeMain.l3();
					LifeMain.sleepInfo();
					u.sleepTime();
					u.sleepinHours = v.nextByte();
					if (u.sleepinHours >= 10) {
						if (u.sleepinHours <= 11) {
							u.goodSleepChild();
							LifeMain.phoneAddiction();
							u.phoneAddictionTest();
							u.phoneUse = v.nextShort();
							if (u.phoneUse <= 5) {
								u.phoneAddictionGood();
								System.out.println("Thank you for using this program.");

							}
							if (u.phoneUse > 5) {
								u.phoneAddictionBad();
								System.out.println("Thank you for using this program.");

							}
						}
						
					}
					if (u.sleepinHours < 10) {
						u.moreSleepChild();
						LifeMain.phoneAddiction();
						u.phoneAddictionTest();
						u.phoneUse = v.nextShort();
						if (u.phoneUse <= 5) {
							u.phoneAddictionGood();
							System.out.println("Thank you for using this program.");

						}
						if (u.phoneUse > 5) {
							u.phoneAddictionBad();
							System.out.println("Thank you for using this program.");

						}
					}
					if (u.sleepinHours > 11) {
						u.lessSleepChild();
						LifeMain.phoneAddiction();
						u.phoneAddictionTest();
						u.phoneUse = v.nextShort();
						if (u.phoneUse <= 5) {
							u.phoneAddictionGood();
							System.out.println("Thank you for using this program.");

						}
						if (u.phoneUse > 5) {
							u.phoneAddictionBad();
							System.out.println("Thank you for using this program.");

						}
					}
				}
				if (u.cal < 1600) {
					u.childUndercal();
					u.childcal();
					LifeMain.helthyTips();
					LifeMain.foodTips();
					LifeMain.l3();
					LifeMain.sleepInfo();
					u.sleepTime();
					u.sleepinHours = v.nextByte();
					if (u.sleepinHours >= 10) {
						if (u.sleepinHours <= 11) {
							u.goodSleepChild();
							LifeMain.phoneAddiction();
							u.phoneAddictionTest();
							u.phoneUse = v.nextShort();
							if (u.phoneUse <= 5) {
								u.phoneAddictionGood();
								System.out.println("Thank you for using this program.");

							}
							if (u.phoneUse > 5) {
								u.phoneAddictionBad();
								System.out.println("Thank you for using this program.");

							}
						}
						
					}
					if (u.sleepinHours < 10) {
						u.moreSleepChild();
						LifeMain.phoneAddiction();
						u.phoneAddictionTest();
						u.phoneUse = v.nextShort();
						if (u.phoneUse <= 5) {
							u.phoneAddictionGood();
							System.out.println("Thank you for using this program.");

						}
						if (u.phoneUse > 5) {
							u.phoneAddictionBad();
							System.out.println("Thank you for using this program.");

						}
					}
					if (u.sleepinHours > 11) {
						u.lessSleepChild();
						LifeMain.phoneAddiction();
						u.phoneAddictionTest();
						u.phoneUse = v.nextShort();
						if (u.phoneUse <= 5) {
							u.phoneAddictionGood();
							System.out.println("Thank you for using this program.");

						}
						if (u.phoneUse > 5) {
							u.phoneAddictionBad();
							System.out.println("Thank you for using this program.");

						}
					}
				}	
			}
			
		}
	
		
	}
	
	
	
	
}

					
	
	


